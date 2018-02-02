computer_science(cs111).
computer_science(cs211).
computer_science(cs311).
computer_science(cs315).
computer_science(cs421).
computer_science(cs436).

math(math270).
math(math242).
math(math372).
math(math480).

physics(phys201).
physics(phys301).

core(cs111).
core(cs211).
core(cs311).
core(math270).
core(phys201).

elective(cs315).
elective(cs436).
elective(math242).
elective(math372).
elective(phys301).

student(newton).
student(galileo).
student(lovelace).
student(turing).

enrolled(newton, cs311).
enrolled(newton, cs4221).
enrolled(newton, math372).

enrolled(turing, math480).
enrolled(turing, cs421).
enrolled(turing, phys301).

enrolled(galileo, cs436).
enrolled(galileo, cs421).

enrolled(lovelace, phys301).
enrolled(lovelace, math372).


passed(newton, cs111).
passed(newton, cs211).

passed(lovelace, cs111).
passed(lovelace, cs211).

passed(galileo, cs111).
passed(galileo, cs211).
passed(galileo, cs311).
passed(galileo, math270).
passed(galileo, phys201).
passed(galileo, math242).
passed(galileo, cs436).

passed(turing, cs111).
passed(turing, cs211).
passed(turing, cs311).
passed(turing, math270).
passed(turing, phys201).
passed(turing, phys301).
passed(turing, math372).

completed_core_courses(X):- passed(X, cs111), passed(X, cs211), passed(X, cs311), passed(X, math270), passed(X, phys201).
 
fulfilled_electives(Y) :- passed(Y, cs315), passed(Y, math242),  passed(Y, phys301).
fulfilled_electives(Z) :- passed(Z, cs436), passed(Z, math372),  passed(Z, phys301).
fulfilled_electives(A) :- passed(A, cs315), passed(A, math372),  passed(A, phys301).
fulfilled_electives(B) :- passed(B, cs436), passed(B, math242),  passed(B, phys301).

satisfied_degree_requirements(Q) :- completed_core_courses(Q), fulfilled_electives(Q).

electives_fulfilled(galileo, cs436).
electives_fulfilled(galileo, math242).

electives_fulfilled(turing, phys301).
electives_fulfilled(turing, math372).
  
