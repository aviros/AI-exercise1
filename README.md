# Introduction to Artificial - Intelligence Assignment 1

The heuristic we chose is:<br>
100*(number of people we cant save)<br>
We compute it in the following manner:<br>
<br>
for each node n with people (that isn't a shelter):<br>
1. calculate the minimum distance from current node to n using dijkstra.<br>
2. calculate the minimum distance from n to closest shelter, given an updated graph representation (considering the path we talk at step 1) using dijkstra.<br>


Comparing the performance of the three agents given k=1, start=V1 we got the following results:<br>

| f | -1 | -100 | -10000 |
| :---: | :---: | :---: | :---: |
| Greedy | 8 | -91 | -9991 |
| A* | 11 | -88 | -9988 |
| RTA*(2) | 5 | -94 | -9994 |
