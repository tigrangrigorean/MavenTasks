package com.tasks.homework13.sixth_exercise;

public enum ShapeType implements Shape{
	SQUARE {
		
		/**
		 * return A * B
		 */
		@Override
		public int getArea() {
			return getA() * getB();
		}
		/**
		 * return A*2 * B*2
		 */
		@Override
		public int getPerimeter() {
			return getA()*2 + getB()*2;
		}
		
	},
	RECTANGLE {
		/**
		 * return A * B
		 */
		@Override
		public int getArea() {
			return getA() * getB();
		}

		@Override
		/**
		 * return A*2 * B*2
		 */
		public int getPerimeter() {
			return getA()*2 + getB()*2;
		}
	};
	
		private int a,b;
		
		/**
		 * 
		 * @param a
		 * @param b
		 */
		void setValues(int a, int b) {
			this.a = a;
			this.b = b;
		}
		
		/**
		 * 
		 * @return a
		 */
	public	int getA() {
			return a;
		}
	/**
	 * 
	 * @return b
	 */
	public	int getB() {
			return b;
		}
		
	

}
