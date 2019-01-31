import com.atomicscala.AtomicTest._
import java.text.SimpleDateFormat
import org.apache.commons.math3.stat.Frequency
import org.apache.commons.math3.stat.descriptive.SummaryStatistics

val datePattern = new SimpleDateFormat("MM/dd/yy")
val mayDay = datePattern.parse("05/01/12")

mayDay.getDate is 1
mayDay.getMonth is 4
mayDay.getYear % 100 is 12

/* Next excercise ... */

// mm is minutes
// MM is months

/* Next excercise ... */

// The value returned from getMonth() is a number between 0 and 11;
// not 1 and 12

/* Next excercise ... */
val f = new Frequency
f.addValue("cat")
f.addValue("dog")
f.addValue("cat")
f.addValue("bird")
f.addValue("cat")
f.addValue("cat")
f.addValue("kitten")
f.addValue("mouse")

f.getCount("cat") is 4

/* Next excercise ... */

val s = new SummaryStatistics
s.addValue(10)
s.addValue(20)
s.addValue(30)
s.addValue(80)
s.addValue(90)
s.addValue(100)

s.getMean.toInt is 55
s.getStandardDeviation is 39.370039370059054
