import numpy as np

def zScore(x):
    mean = np.mean(x)
    std = np.std(x)
    z = (x - mean)/std
    return z