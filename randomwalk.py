import numpy as np
#totally random walk
steps = np.random.normal(loc=0.0,scale=1,size=1000)
steps[0]=0
p = 100 + np.cumsum(steps)
plt.plot(p)
plt.title("Simulated Random Walk")
plt.show()
#random walk with drift
steps2 = np.random.normal(loc=0.001,scale=.01,size=1000) + 1
steps2[0]=1
p2= 100 * np.cumprod(steps2)
plt.plot(p2)
plt.title("Simulated Random Walk with Drift")
plt.show()
#are stock prices random walks test with amazon?
from pandas_datareader.data import DataReader
import pandas as pd
from datetime import date
series = 'AMZN'
source = 'yahoo'
start = date(1997,5,15)
end = date(2017,8,2)
amzn = DataReader(series,source,start,end)
#import the adfuller module from statsmodel
from statsmodels.tsa.stattools import adfuller
results = adfuller(amzn['Adj Close'])
print(results)
#print out just the p-value
print("The p-value of the test on prices is " +str(results[1]))
#prices are random, but what about returns?
amznRet = amzn.pct_change()
amznRet = amznRet.dropna()
results2 = adfuller(amznRet['Adj Close'])
print("The p-value of the test on returns is " + str(results2[1]))

import zScore
amznRet['zAdj'] = zScore(amznRet['Adj Close'])