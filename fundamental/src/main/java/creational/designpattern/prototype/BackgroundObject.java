package creational.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;
// step 2  implement cloneable interface
public class BackgroundObject implements GraphicalObject{

	 private Integer x;
	    private Integer y;
	    public Integer getX() {
			return x;
		}

		public void setX(Integer x) {
			this.x = x;
		}

		public Integer getY() {
			return y;
		}

		public void setY(Integer y) {
			this.y = y;
		}

		public Integer getWidth() {
			return width;
		}

		public void setWidth(Integer width) {
			this.width = width;
		}

		public Integer getHeight() {
			return height;
		}

		public void setHeight(Integer height) {
			this.height = height;
		}

		public BackgroundObjectType getType() {
			return type;
		}

		public void setType(BackgroundObjectType type) {
			this.type = type;
		}

		public List<Integer> getPixels() {
			return pixels;
		}

		public void setPixels(List<Integer> pixels) {
			this.pixels = pixels;
		}

		private Integer width;
	    private Integer height;
	    private BackgroundObjectType type;
	    private List<Integer> pixels = new ArrayList<>();

	    public BackgroundObject(Integer x, Integer y, Integer width, Integer height, BackgroundObjectType type) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	        this.type = type;
	    }

	    public BackgroundObject(Integer x, Integer y, Integer width, Integer height, BackgroundObjectType type, List<Integer> pixels) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	        this.type = type;
	        this.pixels = pixels;
	    }

	    @Override
	    public BackgroundObject cloneObject() {
	        return new BackgroundObject(x, y, width, height, type, pixels);
	    }
}
