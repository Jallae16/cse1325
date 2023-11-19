#ifndef __LOCATION_H
#define __LOCATION_H

#include <iostream>
#include <string>

class Location{
	public:
		Location(std::string filename, int line);
		
		inline bool operator==(const Location& location)const;
		inline bool operator!=(const Location& location)const;
		inline bool operator< (const Location& location)const;
		inline bool operator> (const Location& location)const;
		inline bool operator<=(const Location& location)const;
		inline bool operator>=(const Location& location)const;
		
		friend std::ostream& operator<<(std::ostream& ost, const Location& location);
		
	private:
		std::string _filename;
		int _line;
};

#endif
