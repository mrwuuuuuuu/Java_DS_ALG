package org.vincent.study.ds.search;

public class KeyWords {
	private static String[] keywords = { "abstract", "boolean", "break", "byte", "case", "catch", "char", "class",
			"continue", "default", "do", "double", "else", "extends", "false", "final", "finally", "float", "for", "if",
			"implements", "import", "instanceof", "int", "interface", "long", "native", "new", "null", "package",
			"private", "protected", "public", "return", "short", "static", "super", "switch", "synchronized", "this",
			"throw", "throws", "transient", "try", "true", "void", "volatile", "while" };
	
	private static IndexItem index[] = { new IndexItem("a", 0), new IndexItem("b", 0), new IndexItem("c", 4),
			new IndexItem("d", 9), new IndexItem("e", 12), new IndexItem("f", 14), new IndexItem("i", 19),
			new IndexItem("l", 25), new IndexItem("n", 26), new IndexItem("p", 29), new IndexItem("r", 33),
			new IndexItem("s", 34), new IndexItem("t", 39), new IndexItem("v", 45), new IndexItem("w", 47) };

	private static class IndexItem implements Comparable<IndexItem> {
		String first;
		int start;

		public IndexItem(String first, int i) {
			this.first = first;
			this.start = i;
		}

		public IndexItem(String first) {
			this(first, -1);
		}

		@Override
		public String toString() {
			return this.first;
		}

		public int compareTo(IndexItem item) {
			return this.first.compareTo(item.first);
		}
	}

}
