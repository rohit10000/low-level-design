#pragma once
#include<iostream>

using namespace std;

template<class T>
class ring {
private:
	T* m_values;
	int m_pos, m_size;
public:
	class iterator;
public:
	ring(int size) :m_values(nullptr), m_size(size), m_pos(0) {
		m_values = new T[size+1];
	}
	~ring() {
		delete[] m_values;
	}

	void add(T value) {
		m_values[m_pos] = value;
		m_pos++;
		if (m_pos == m_size)
			m_pos = 0;
	}
	iterator begin() {
		return iterator(0, *this);
	}

	iterator end() {
		return iterator(m_size, *this);
	}

	T& get(int pos) {
		return m_values[pos];
	}

};

template<class T>
class ring<T>::iterator {
private:
	int m_pos;
	ring& m_ring;
public:
	iterator(int pos, ring& aRing) :m_pos(pos), m_ring(aRing) {
	}

	bool operator!=(const iterator& other) {
		return m_pos != other.m_pos;
	}

	iterator& operator++(int) {
		m_pos++;
		
		return *this;
	}

	iterator& operator++() {
		m_pos++;

		return *this;
	}

	T& operator*() {
		return m_ring.get(m_pos);
	}


};
