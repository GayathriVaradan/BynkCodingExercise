# BynkCodingExercise

The Exercise  is to get the rank for word(s) searched from a single file using Scala.

Ranking Formula:
If all the words in the console search is present in the file the rank is 100%
If only few words are present in the file, then accordingly the rank is displayed.
Ex1: If only 4 out of 5 words are present then, the rank would be (4/5)*100 = 80.0%
Ex2: If only 7 out of 12 words are present then, the rank would be (7/12)*100 = 58.333332% 
and so on..

Build and Run the code:
WordCount.scala is to be run in Eclipse by creating a new Project.
The .txt file is to be placed below the src folder.
Which ever file is to be tested, is to be placed between the double quotes in the below line in WordCount.scala.
    val source = Source.fromFile(" .txt").getLines

