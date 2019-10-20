
import scala.io.Source
import java.io.File
import java.util

object Wordcount {
  def main(args: Array[String]) {
    print("search> ")
    val source = Source.fromFile("codegeek.txt").getLines
    var matchedCount = 0;
    val lineFromConsole = Console.readLine()
    val wordsInConsole = lineFromConsole.split("\\W+").filter(_.nonEmpty).distinct;

    def wordCnt = source
      .filter(_.nonEmpty)
      .flatMap(_.split("""\W+""")).toSeq
      .groupBy(_.toLowerCase())
      .mapValues(_.size).toSeq

    wordCnt.foreach {
      case ((wordInFile, count)) =>
        for (wordInConsole <- wordsInConsole) {
          if (wordInFile.equalsIgnoreCase(wordInConsole)) {
            //println("The Searched Word :  " + wordInFile + " is present!")
            matchedCount += 1;
          }
        }
    }
    val rank = (matchedCount.toFloat / wordsInConsole.length) * 100;
    printf(s"Rank of the given words is : $rank%%")
  }
}