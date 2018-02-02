READ ME file for caesar.lisp file, "The Ceasar Cipher program".

To compile the program on empress, you must first invoke lisp by typing in the command "clisp".
Once inside clisp, to compile the program enter "compile-file" followed by the filename and its' .lisp extension, all together in paranthese.

Compiling this program specifically looks as follows:
 (compile-file "caesar.lisp")

After compiling, run the program by typing "load" followed by the filename and its' .lisp extension, all together in paranthese.

Running this program specifically looks as follows:
	(load "caesar.lisp")

The program contains functions to either encode or decode a cipher, taken as a list through user input.

    To encode a function, enter (encode ), followed by a phrase as a list.
       For example, (encode '((p r o g r a m m i n g)(l a n g u a g e s)))
       
    To decode a function, enter (decode ), followed by a phrase as a list.
       For example, (decode '((u w t l w f r r n s l) (q f s l z f l j x)))

ALL CIPHERS MUST BE ENTERED AS A LIST. ALL LETTERS MUST ALSO HAVE A SPACE BETWEEN THEM.

