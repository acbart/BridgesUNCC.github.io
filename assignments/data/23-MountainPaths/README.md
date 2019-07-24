Mountain Path
=============

Source
------

This is a nifty assignment from 2016 proposed by Baker Franke.
[Source](http://nifty.stanford.edu/2016/franke-mountain-paths/)



Description
-----------

You are given elevation data of a mountainous region in the form of a 2D array of integers (see example image below of one of the datasets). Your goal is to find a path that takes you through the points with the lowest elevation changes, in an effort to minimize the overall effort in walking through the path. For this you will use a ‘greedy’ approach and make local decisions in determining the successive points in the path.

See the  image  below. The image shows a mountainous region (lighter regions are higher elevation) and the red line shows the path to be taken by a walker.

 

An example elevation dataset as an image (JPG image)

Fig. 1: Input gray scale image of a terrain with  gray shades mapped to elevation. Elevation ranges from low (dark colors) to high (lighter colors)

 

Algorithm To Determine the Path:

Greedy strategy to be used (4 cases)

Fig. 2: Figure above shows how algorithm applies the greedy strategy to a pixel (with grayscale values shown). The algorithm looks to the 3 choices and picks the pixel that  causes the smallest change (least effort to walk).

 

See the figure above.The idea is to start from an edge of the image (say the leftmost column), then make moves based on the pixels to the right, each time choosing the pixel that results in the smallest change. Your goal is to reach the right edge of the image.

 

Tasks:
------

### Read dataset, Create image.
        Use file I/O (ifstream) to read the dataset. You will read the dataset into a 1D array.   As you read the data, keep track of the maximum value, as you will need to scale the values to the (0-255) range to display the image.

You will need to store the data in an array. Use the C++ new operator to allocate memory to hold the data. Once you dont require the input data, call delete method to return the storage to the system. For this project you can simply allocate the data and store it in an integer array (for instance, int *data = new int[size];)

The input data file format is text, and  will contain the width, height values, followed by and  width*height integer values  in sequence. The first 480 values (for this image) belong to row 1, the next 480 values to row 2,  and so on. See for example the top of  this input image data:   Colorado_480x480.datPreview the document   

Once you have read the dataset into your array, then scale the values to 0-255 range and convert that to an integer (basically divide each value by the largest and scale to 255). You will then modify the BRIDGES example program to load the values using R,G, B triplets for each entry of the color grid.  Use the setRed(), setGreen() and setBlue() methods. These values should be integers and in the range of 0-255. We are dealing with gray scale images, so  R=G=B. So if you get a value o 202, then you put 202 for red, green and blue.

###Display the image using BRIDGES.

###Compute the Lowest Elevation Path. 

Run your greedy algorithm on the image.  Choose a pixel in the left most column, somewhere in the middle region.  Your program will determine the points in the path that exhibit the smallest change in elevation and draw this path in a distinct color (like red). Pixels in the path will have their values changed to this color (for instance, use (255, 0, 0) for red.  As you compute these low elevation points, modify your color grid to draw the red pixels.  You need to keep track of the pixel addresses, so that you dont go past the boundaries of  the dataset (grid).

2D address (row, col) given a 1D  address (addr) can be computed as   follows:

        row =  addr/width,
        col  = addr - y*width 

        Display the image (your solution should look something like the figure at the top of the page.



Variants
--------

One can make variants of this assignments. Indeed, the greedy
algorithm presented above is a heuristic; it does not return the path
that sees the lowest change of elevation across the entire
mountain. It only makes a local choice.

One can find the path that always goes right and that minimizes the
total change of elevation using Dynamic Programming. Propose a Dynamic
Programming algorithm, and implement it to highlight the right-going
path of minimal total change of elevation.

If one does not always go right, then the problem is akin to a
Shortest Path problem. Adapt Dijkstra's algorithm and implement it to
highlight the path of least change of elevation.

Graduate students can consider the problem of optimizing
simultaneously the distance traversed and the total change of
elevation as a bi objective optimization problem.