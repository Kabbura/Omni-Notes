/*
 * Copyright (C) 2018 Federico Iosue (federico.iosue@gmail.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundatibehaon, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.feio.android.omninotes.models;

public class StatsSingleNote {

    int tags;
    private int attachments;
    private int images;
    private int videos;
    private int audioRecordings;
    private int sketches;
    private int files;

    private int words;
    private int chars;

    private int checklistElements;


    public int getTags() {
        return tags;
    }


    public void setTags(int tags) {
        this.tags = tags;
    }


    public int getWords() {
        return words;
    }


    public void setWords(int words) {
        this.words = words;
    }


    public int getChars() {
        return chars;
    }


    public void setChars(int chars) {
        this.chars = chars;
    }


    public int getAttachments() {
        return attachments;
    }


    public void setAttachments(int attachments) {
        this.attachments = attachments;
    }


    public int getImages() {
        return images;
    }


    public void setImages(int images) {
        this.images = images;
    }


    public int getVideos() {
        return videos;
    }


    public void setVideos(int videos) {
        this.videos = videos;
    }


    public int getAudioRecordings() {
        return audioRecordings;
    }


    public void setAudioRecordings(int audioRecordings) {
        this.audioRecordings = audioRecordings;
    }


    public int getSketches() {
        return sketches;
    }


    public void setSketches(int sketches) {
        this.sketches = sketches;
    }


    public int getFiles() {
        return files;
    }


    public void setFiles(int files) {
        this.files = files;
    }


	public int getChecklistElements() {
		return checklistElements;
	}


	public void setChecklistElements(int checklistElements) {
		this.checklistElements = checklistElements;
	}
}
