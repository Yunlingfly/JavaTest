echo "开始程序"

for((i=1;i<=3;i++));
do
    cd Exam"$i"
    echo "第 $i 个题目："
    mvn clean
    mvn compile
    mvn package
    cd target
    java -jar test"$i".jar
    cd ..
    cd ..
done;

# cd test1
# echo "第一个题目"
# mvn clean
# mvn compile
# mvn package
# cd target
# java -jar test1.jar
# cd ..
# cd ..

# cd test2
# echo "第二个题目："
# mvn clean
# mvn compile
# mvn package
# cd target
# java -jar test2.jar
# cd ..
# cd ..