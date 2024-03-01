package graph;

import java.util.Objects;

public class Vertex {
	private String label;

	// Below commented line was the reason the graph was not getting constructed during the session - typo on String lable
	//public Vertex(String lable) {
	public Vertex(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public int hashCode() {
		return Objects.hash(label);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Vertex other = (Vertex) obj;
		return Objects.equals(label, other.label);
	}

	@Override
	public String toString() {
		return "Vertex [" + label + "]";
	}
}
