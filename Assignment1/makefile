JAVAC=javac
sources = $(wildcard *.java)
classes = $(sources:.java=.class)
classpath = $(edu.drexel.assignment1)

all: $(classes)

clean :
	rm -f *.class

%.class : %.java
	$(JAVAC) -cp $(classpath) $<

program1: all
	java -classpath . Program1