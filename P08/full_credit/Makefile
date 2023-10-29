CXXFLAGS += --std=c++17

all: hello hello_all

hello: hello.cpp
	-$(CXX) $(CXXFLAGS) -o hello hello.cpp

hello_all: hello_me.cpp
	-$(CXX) $(CXXFLAGS) -o hello_me hello_me.cpp

clean:
	-rm -f *.o *.gch *~ a.out hello hello_all
