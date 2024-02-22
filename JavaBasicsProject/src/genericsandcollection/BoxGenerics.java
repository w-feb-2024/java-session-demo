package genericsandcollection;

public class BoxGenerics<T, K> {
	private T length;
	private T width;
	private K height;
	private String name;
	
	public BoxGenerics(T length, T width, K height, String name) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
		this.name = name;
	}
	public T getLength() {
		return length;
	}
	public void setLength(T length) {
		this.length = length;
	}
	public T getWidth() {
		return width;
	}
	public void setWidth(T width) {
		this.width = width;
	}
	public K getHeight() {
		return height;
	}
	public void setHeight(K height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "BoxGenerics [length=" + length + ", width=" + width + ", height=" + height + ", name=" + name + "]";
	}
}
