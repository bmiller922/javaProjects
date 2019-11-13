from pandas_datareader.data import DataReader
import pandas as pd
from datetime import date
import matplotlib.pyplot as plt
import seaborn as sns
import statsmodels.api as sm

series_code = 'IWM' #Chicago Fed National Financial Conditions Index
data_source = 'yahoo' #FED economic data
start = date(2005,1,1)
data = DataReader(series_code, data_source, start)
data['IWM_C'] = data['Adj Close']

series_code2 = 'SPY' #S&P500
data_source2 = 'yahoo' #FED economic data
data2 = DataReader(series_code2, data_source2, start)
data2['SPY_C'] = data2['Adj Close']

combined_df = pd.concat([data,data2],axis =1)
cDf = combined_df.loc[:,['IWM_C' , 'SPY_C']]
cDf['IWM_Ret'] = cDf['IWM_C'].pct_change()
cDf['SPY_Ret'] = cDf['SPY_C'].pct_change()
cDf = sm.add_constant(cDf)
cDf = cDf.dropna()
print(cDf.info())

results = sm.OLS(cDf['IWM_Ret'],cDf[['const','SPY_Ret']]).fit()
print(results.summary())
intercept = results.params[0]
beta = results.params[1]

fig, ax = plt.subplots(2)
fig = sm.graphics.plot_fit(results,1,ax=ax[0])
ax[0].set_title("IWM vs SPY returns")

sns.regplot(cDf['SPY_Ret'],cDf['IWM_Ret'],ax=ax[1])
plt.show()
