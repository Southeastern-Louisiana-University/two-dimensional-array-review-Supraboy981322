Imagine using an IDE. Couldn't be me. (at least NeoVim doesn't randomly break when it updates)

# Two Dimensional Array practice
Key Point Nested for loops are often used to process a two-dimensional array. Suppose an array matrix is created as follows: int[][] matrix = new int[10][10];
The following are some examples of processing two-dimensional arrays. 

1. Initializing arrays with input values. The following loop initializes the array with user
input values:

2. Initializing arrays with random values. The following loop initializes the array with random values between 0 and 99:

3.  Printing arrays. To print a two-dimensional array, you have to print each element in the array using a loop.

4.   Summing all elements. Use a variable named total to store the sum. Initially total is 0. Add each element in the array to total using a loop
  
5.  Summing elements by column. Assume every row has the same number of elements. For each column, use a variable named total to store its sum. Add each element in the column to total using a loop.

6.  Which row has the largest sum? Use variables maxRow and indexOfMaxRowto track the largest sum and index of the row. For each row, compute its sum and update maxRow and indexOfMaxRow if the new sum is greater.

7. Random shuffling. Shuffling the elements in a one-dimensional array was introduced in Section 7.2.6. How do you shuffle all the elements in a two-dimensional array? To accomplish this, for each element matrix[i][j], randomly generate indices i1 and j1 and swap matrix[i][j] with matrix[i1][j1].
