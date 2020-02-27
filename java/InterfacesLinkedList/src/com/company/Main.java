package com.company;

import java.util.*;

public class Main {
    private static List<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Chainsmokers", "Drew");
        album.addSong("Sick Boy", 4.6);
        album.addSong("Paris", 3.2);
        album.addSong("Roses", 2.2);
        album.addSong("Beach House", 4.2);
        album.addSong("Something", 3.6);
        album.addSong("The One", 2.9);
        album.addSong("Reaper", 4.6);

        albums.add(album);

        album = new Album("Orphan", "ColdPlay");
        album.addSong("Scientist", 4.6);
        album.addSong("Doctor", 5.1);
        album.addSong("Beautiful", 3.4);
        album.addSong("Jargon", 4.6);
        album.addSong("Holi", 3.2);
        album.addSong("Ice", 2.9);

        albums.add(album);


        List<Song> playList = new ArrayList<>();
        albums.get(0).addToPlaylist("Paris", playList);
        albums.get(0).addToPlaylist("Roses", playList);
        albums.get(0).addToPlaylist("Reaper", playList);
        albums.get(0).addToPlaylist("Hello", playList); //Doesn't exist
        albums.get(0).addToPlaylist(4, playList);
        albums.get(1).addToPlaylist(1, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(24, playList);

        play(playList);
    }

    private static void play(List<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playlist");
            return;
        }else{
            System.out.println("Now Playing " +  listIterator.next().toString());
            printMenu();
        }

        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous().toString());
                    }else{
                        System.out.println("We reached the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forward = false;
                        }else{
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        }else{
                            System.out.println("We are at the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next());
                        }else{
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Availabe actions: \npress");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - Print available actions\n" +
                "6 - Delete current song from Playlist\n");
    }

    private static void printList(List<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("================");
    }


}
