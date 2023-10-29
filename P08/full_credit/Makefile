CXXFLAGS += --std=c++17

all: hello hello_all

hello: hello.cpp
    -$(CXX) $(CXXFLAGS) -o hello hello.cpp

hello_all: hello_all.cpp
    -$(CXX) $(CXXFLAGS) -o hello_all hello_all.cpp

clean:
    -rm -f *.o *.gch *~ a.out hello hello_all
