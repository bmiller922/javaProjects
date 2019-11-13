from pandas_datareader.data import DataReader
import pandas as pd
from datetime import date
import matplotlib.pyplot as plt
import seaborn as sns

series_code = 'WTISPLC' #Chicago Fed National Financial Conditions Index
data_source = 'fred' #FED economic data
start = date(2005,1,1)
data = DataReader(series_code, data_source, start)
print(data.info())

series_code2 = 'OIH' #S&P500
data_source2 = 'yahoo' #FED economic data
data2 = DataReader(series_code2, data_source2, start)
print(data2.info())

combined_df = pd.concat([data,data2],axis =1)
print(type(combined_df))
print(combined_df.info())

series_name = str(series_code) + 'vs' + str(series_code2)
#data = data.rename(columns={series_code: series_name})
#combined_df.plot(title=series_name)

#plt.figure(figsize=(12,5))

ax1 = data.iloc[:,0].plot(color='blue',grid=True,label=series_code)
ax2 = data2['Adj Close'].plot(color='red',grid=True, secondary_y=True,label=series_code2)
#ax1.invert_yaxis()
ax1.legend(loc=4)
ax2.legend(loc=2)
plt.show()

sns.regplot(combined_df.iloc[:,0],combined_df.iloc[:,-1])
plt.show()

