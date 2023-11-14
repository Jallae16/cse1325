#ifndef __TIME_H
#define __TIME_H

#include <iostream>

class Time{

	public:
		Time(int hour, int minute, int second);
		Time();
		
		friend std::ostream& operator<<(std::ostream& os, const Time& time);
		friend std::istream& operator>>(std::istream& is, Time& time);
		friend Time operator+(int seconds, Time& time);
		
		Time operator+(Time time);
		Time operator+(int seconds) const;
		
		Time& operator++();
		Time operator++(int);
		
		inline bool operator==(const Time& time){return (compare(time) == 0);}
		inline bool operator!=(const Time& time){return (compare(time) != 0);}
		inline bool operator<(const Time& time){return (compare(time) < 0);}
		inline bool operator>(const Time& time){return (compare(time) > 0);}
		inline bool operator<=(const Time& time){return (compare(time) <= 0);}
		inline bool operator>=(const Time& time){return (compare(time) >= 0);}
	private:
		int _hour;
		int _minute;
		int _second;
		void rationalize();
		int compare(const Time& time)const;
};

#endif
