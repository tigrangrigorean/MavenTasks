package com.tasks.homework13.fifth_exercise;

public enum Unit implements BaseUnit{
	
	METER {
		
		@Override
		public String getBaseUnit() {
			return "1 M";
		}
	},
	KILOGRAM {

		@Override
		public String getBaseUnit() {
			return "1 kg";
		}
	},
	SECOND {
		@Override
		public String getBaseUnit() {
			return "1 sec";
		}
	},
	AMPERE {

		@Override
		public String getBaseUnit() {
			return "1 amper";
		}
		
	},
	 KELVIN {
		@Override
		public String getBaseUnit() {
			return "1 Kelvin";
		}
	},
	 MOLE {
		@Override
		public String getBaseUnit() {
			return "1 gramm mol";
		}
	},
	 CANDELA {
		@Override
		public String getBaseUnit() {
			return "1 candela";
		}
	};
	
	
	
	
}
