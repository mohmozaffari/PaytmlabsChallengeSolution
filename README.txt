This solution provides a data structure to hold all elements added to the data structure, and calculate the average of the last N elements added to it.
To do so, MovingAverage interface, MovingAverageImpl (implementation of the interface), and MovingAverageDemo classes are added.

The implementation uses a queue to keep track of the last N elements added to the data structure and uses a list to store all elements that are added to it.

MovingAverage can be initialized by passing the number N to the constructor to indicate the size of last elements to calculate the average.
For example:

MovingAverage movingAverage = new MovingAverageImpl(4);
Indicates to calculate the average of last 4 elements.

To add element to the data structure we can use addElement() method: movingAverage.addElement(3);

And to calculate the average we can use getAverage() method: movingAverage.getAverage()