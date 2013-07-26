GNU Prolog For Java


INTRODUCTION

Hi and welcome to the 0.2.6 release of GPJ!


INSTALLATION

The latest version available is 0.2.6.

0. Install Java (version 1.6 or higher)

1. Prolog for Java can be found on the main GNU ftp server: 
http://ftp.gnu.org/gnu/gnuprologjava/ (via HTTP) 
and 
ftp://ftp.gnu.org/gnu/gnuprologjava/ (via FTP). 

2. It can also be found on the GNU mirrors; please use a mirror if possible. 

If you are using eclipse and want to contribute; you may want to import the GPJ as an archive.


CONTRIBUTION

- You can submit the issues: https://github.com/drt24/gnuprologjava/issues or https://github.com/rishabhgarg/gnuprologjava-1/issues?state=open

- https://savannah.gnu.org/bugs/?group=gnuprologjava contains a list of bugs in GPJ. You are welcome to submit a patch/issue here


EXAMPLE

	//Create an Environment environment (gnu.prolog.vm.Environment) 
	which provides the core of the prolog environment
	gnu.prolog.vm.Environment environment = new Environment();
	//Then load any prolog files you want to which define additional predicates
	//Say the file contains: 
	//b(23).
	environment.ensureLoaded(AtomTerm.get(Some file));
	//Create an Interpreter to execute goals. You need at least one in your program
	gnu.prolog.vm.Interpreter interp = environment.createInterpreter();
	environment.runInitialization(interp);
	//Setting a goal b(X)
	VariableTerm term = new VariableTerm("X");
	Term[] ter = new Term[1];
	ter[0] = term;
	//b(X)
	CompoundTerm comp = new CompoundTerm("b",ter);
	


	System.out.println(term.dereference()); will print 23. 

Arbitrarily complex Prolog goals can be handled with using GPJ. 


DOCUMENTATION

Can be found here: http://www.gnu.org/software/gnuprologjava/api/
(Under extensive expansion)


Please write to rishabhgarg.as@gmail.com to have your queries handled personally. 

You can also write and participate in the discussions by using the official mailing list info-gnuprologjava@gnu.org.