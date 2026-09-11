entr:
	mvn clean comile assembly:single -Dtest=EntityResolution - Dsurefire.useFile=false

nyt:
	#mvn -Dtest=NYTExperimentTest -Dsurefire.useFile=false test
	mvn clean compile assembly:single -Dtest=NYTExperimentTest -Dsurefire.useFile=false test

toy:
	mvn -Dtest=ToyExperimentTest -Dsurefire.useFile=false test

fancy:
	mvn -Dtest=FancyExperimentTest -Dsurefire.useFile=false test

compile:
	mvn install
