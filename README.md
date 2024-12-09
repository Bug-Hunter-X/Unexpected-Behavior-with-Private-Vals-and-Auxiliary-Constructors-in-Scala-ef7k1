# Scala Bug: Private Vals and Auxiliary Constructors

This repository demonstrates a subtle bug related to private values and auxiliary constructors in Scala. When an auxiliary constructor initializes a private val, accessing that value from outside the class can lead to unexpected or incorrect results.

## Bug Description

The bug occurs when a class uses an auxiliary constructor to initialize a private val.  If you attempt to access this private val directly from outside the class, the accessor methods need to be implemented.  

## Solution

The solution involves creating accessor methods to access the private values. This allows controlled access to the private members while maintaining encapsulation.