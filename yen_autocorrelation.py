from pandas_datareader.data import DataReader
import pandas as pd
import matplotlib.pyplot as plt
from datetime import date

series_code = 'DEXJPUS'
data_source = 'fred'
startDate = date(1979,1,1)
jpy = DataReader(series_code,data_source=data_source,start=startDate)
jpy.index = pd.to_datetime(jpy.index)
jpy['usdjpy'] = jpy['DEXJPUS']
del jpy['DEXJPUS']
jpy['returns'] = jpy['usdjpy'].pct_change()
autocorrelation_daily = jpy['returns'].autocorr()
print("The daily autocorrelation is: " + str(autocorrelation_daily))
jpyWeekly = jpy.resample('W').last()
jpyWeekly['weekly_returns'] = jpyWeekly['usdjpy'].pct_change()
atuocorrelation_weekly = jpyWeekly['weekly_returns'].autocorr()
print("The weekly autocorrelation is: " + str(atuocorrelation_weekly))
jpyMonthly = jpy.resample('M').last()
jpyMonthly['returns'] = jpyMonthly['usdjpy'].pct_change()
autocorrelation_monthly = jpyMonthly['returns'].autocorr()
print("The monthly autocorrelation is: " + str(autocorrelation_monthly))
