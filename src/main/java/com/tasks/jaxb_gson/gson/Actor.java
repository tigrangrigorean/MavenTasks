package com.tasks.jaxb_gson.gson;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Actor {

	   @SerializedName("name")
	    private String name;

	    @SerializedName("artist")
	    private String artist;

	    @SerializedName("description")
	    private String description;

	    @SerializedName("tags")
	    private List<String> tags;
	    
	    /**
	     * Default Constructor
	     */
	    public Actor() {
	    	
	    }

		/**
		 * @param name
		 * @param artist
		 * @param description
		 * @param tags
		 */
		public Actor(String name, String artist, String description, List<String> tags) {
			super();
			this.name = name;
			this.artist = artist;
			this.description = description;
			this.tags = tags;
		}

		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}

		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}

		/**
		 * @return the artist
		 */
		public String getArtist() {
			return artist;
		}

		/**
		 * @param artist the artist to set
		 */
		public void setArtist(String artist) {
			this.artist = artist;
		}

		/**
		 * @return the description
		 */
		public String getDescription() {
			return description;
		}

		/**
		 * @param description the description to set
		 */
		public void setDescription(String description) {
			this.description = description;
		}

		/**
		 * @return the tags
		 */
		public List<String> getTags() {
			return tags;
		}

		/**
		 * @param tags the tags to set
		 */
		public void setTags(List<String> tags) {
			this.tags = tags;
		}

		@Override
		public String toString() {
			return "Actor [name=" + name + ", artist=" + artist + ", description=" + description + ", tags=" + tags
					+ "]";
		}

	
}
