from pandas_datareader.data import DataReader
import pandas as pd
import matplotlib.pyplot as plt
from datetime import date

series_code = 'msft'
data_source = 'yahoo'
startDate = date(2012,1,1)
endDate = date(2019,11,1)
msft = DataReader(series_code,data_source,startDate,endDate)
msft = msft.resample('W').last()

returns = msft['Adj Close'].pct_change().dropna()
autocorrelation = returns.autocorr()
print("The autocorrelation of weekly returns is %4.2f" %(autocorrelation))
###########################################################################################
from statsmodels.graphics.tsaplots import plot_acf
from math import sqrt
#find number of observations
nobs = len(returns)
#compute approximate confidence interval
conf = 1.96/sqrt(nobs)
print("The approximate confidence interval is +/- %4.2f" %(conf))
#plot the autocorrelation function with 95% confidence interval and 20 lags using plot_acf
plot_acf(returns,alpha=0.05,lags=20,title="MSFT Autocorrelation")
plt.show()
#compare to white noise
import numpy as np
whiteNoise = np.random.normal(loc=0.0025, scale= 0.05, size=1000)
#print white noise mean/std 
wnMean = np.mean(whiteNoise)
wnStd = np.std(whiteNoise)
print("The white noise mean is %5.3f and the white noise standard deviation is %5.3f" %(wnMean,wnStd))
plt.plot(whiteNoise)
plot_acf(whiteNoise,alpha=0.05, lags=20, title="White Noise Autocorrelation")
plt.show()
##### zScore to msft returns
from zScore import zScore
returns['zAdj']=zScore(returns)
plt.plot(returns['zAdj'])
plt.title("MSFT z Score adjusted returns")
plt.show()