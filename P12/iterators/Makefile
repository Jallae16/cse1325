CXXFLAGS = --std=c++17

info:
	@echo
	@printf 'Type e.g., "make solution"  to create program "solution" from solution.cpp\n'
	@printf 'Type       "make all"   to create every program\n'
	@printf 'Type       "make clean" to delete every program\n\n'

solution: suggested_solution.cpp
	-$(CXX) $(CXXFLAGS) -o solution suggested_solution.cpp
	@printf "Now type ./solution captain.txt Captain! to execute the result\n\n"

all:  solution

erase: find_erase.cpp
	-$(CXX) $(CXXFLAGS) -o find_erase find_ersae.cpp 
	@printf "Now type ./find_erase captain.txt Captain! to execute the result\n\n"
	
clean:
	rm -f *.o *.gch a.out solution

