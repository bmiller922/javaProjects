import pandas as pd
from pandas_datareader.data import DataReader
import matplotlib.pyplot as plt
from datetime import date
from statsmodels.tsa.stattools import acf
from statsmodels.graphics.tsaplots import plot_acf

series = 'DGS10'
datasource = 'fred'
start = date(1984,1,1)
end = date(2017,1,1)
data = DataReader(series,datasource,start)
data['dailydiff'] = data.diff()
autocorrelation_daily = data['dailydiff'].autocorr()
print("The autocorrelation of daily " + str(series)+ " changes is %4.2f" %(autocorrelation_daily))

weekly_data = data[series].resample('W').last()
weekly_data['weeklydiff'] = weekly_data.diff()
autocorrelation_weekly = weekly_data['weeklydiff'].autocorr()
print("The autocorrelation of weekly " + str(series)+ " changes is %4.2f" %(autocorrelation_weekly))

monthly_data = data[series].resample('M').last()
monthly_data['monthlydiff'] = monthly_data.diff()
autocorrelation_monthly = monthly_data['monthlydiff'].autocorr()
print("The autocorrelation of monthly " + str(series)+ " changes is %4.2f" %(autocorrelation_monthly))

annual_data = data[series].resample('A').last()
annual_data['annualdiff'] = annual_data.diff()
autocorrelation_annual = annual_data['annualdiff'].autocorr()
print("The autocorrelation of yearly " + str(series)+ " changes is %4.2f" %(autocorrelation_annual))
#####
#compute and plot acf functions
acf_array = acf(data['dailydiff'].dropna())
print(acf_array)
plot_acf(data['dailydiff'].dropna(),alpha=.05)
plt.show()

