package com.test.hfdp.iterator;

public class DinerMenuIterator implements java.util.Iterator {
	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (items[position] == null || position >= items.length) {
			return false;
		}
		return true;
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items[position];
		position++;
		return menuItem;
	}

	public void remove() {
		if (position < 0) {
			throw new IllegalStateException("Cant remove");
		}
		if (items[position - 1] != null) {
			for (int i = position - 1; i < (items.length - 1); i++) {
				items[i] = items[i + 1];
			}
			items[items.length - 1] = null;
		}
	}
}
