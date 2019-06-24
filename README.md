# LogicGates
The Self-Deprecating Developer Episode #1

The Self-Deprecating Developer is a series in which I -- the useless developer -- try to complete a variety of projects, and document their progress.

So essentially, I milk my career for views.

# Documentation

##### LogicGate
```
#getInput1() - returns the boolean value of input1.
#getInput2() - returns the boolean value of input2.
#setInput1(boolean b) - sets the boolean value of input1.
#setInput2(boolean b) - sets the boolean value of input2.
#setInput1(boolean[] inputs) - sets the boolean value of input1 from the first item in a boolean array.
#setInput2(boolean[] inputs) - sets the boolean value of input2 from the second item in a boolean array.
#invertQuery() - returns the inverse of getQuery().
#getQuery() - abstract, must be implemented by every subclass.
```

###### AndGate
```
#getQuery() - returns true if:
  input1 = true AND
  input2 = true
```

###### NandGate
```
#getQuery() - returns the inverse of AndGate.getQuery();
```

###### OrGate
```
#getQuery() - returns true if:
  input1 = true OR
  input2 = true
```

###### NorGate
```
#getQuery() - returns the inverse of OrGate.getQuery();
```

###### ExorGate
```
#getQuery() - returns true if:
  input1 = true AND input2 = false OR
  input1 = false AND input2 = true
```

###### ExNorGate
```
#getQuery() - returns the inverse ExorGate.getQuery();
```
