package addressBookStream_Day24;

import java.util.Comparator;

public class SortFunction {
	  static Comparator<PersonContact> compareCity = new Comparator<PersonContact>() {
	        public int compare(PersonContact one, PersonContact two) {
	            return one.getCity().compareTo(two.getCity());
	        }
	    };
	    static Comparator<PersonContact> compareState = new Comparator<PersonContact>() {
	        public int compare(PersonContact one, PersonContact two) {
	            return one.getState().compareTo(two.getState());
	        }
	    };
	}