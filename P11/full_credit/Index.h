#ifndef __INDEX_H
#define __INDEX_H

#include <iostream>
#include <string>
#include <map>

class Index{
	public:
		void add_word(Word word, string filename, int line);
		friend std::ostream& operator<<(std::ostream& ost, const Index& index);
	private:
		map<Word, Locations> _index;
}
