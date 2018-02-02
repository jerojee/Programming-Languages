README file for Ojeda.pl (CS351 Prolog University Database Program)

This program holds a knowledge base that contains facts and rules about regulations on completion of degrees in a university. Below are some sample quereies used to test my program, there output is also shown: 

?- satisfied_degree_requirements(turing).
no
?- electives_fulfilled(galileo, X).
X=cs436;

X=math242;

no
?- passed(galileo, math270).
yes
