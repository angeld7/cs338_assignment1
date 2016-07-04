JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
    $(JC) $(JFLAGS) $*.java

CLASSES = \
    src/edu/drexel/assignment1/Program1.java \
    src/edu/drexel/assignment1/Program2.java \
    src/edu/drexel/assignment1/Program3.java

default: classes

classes: $(CLASSES:.java=.class)

program1: classes
program2: classes
program3: classes

clean:
    $(RM) *.class