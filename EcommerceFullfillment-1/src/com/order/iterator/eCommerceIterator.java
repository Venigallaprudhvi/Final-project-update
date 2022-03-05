package com.order.iterator;

import java.util.Iterator;
import java.util.List;

public class eCommerceIterator<T> {
	
	private List<T> source = null;
	private int index = 0;

public eCommerceIterator(List<T> source){
    this.source = source;
}


public boolean hasNext() {
    return this.index < this.source.size();
}

public T next() {
    return this.source.get(this.index++);
}
}