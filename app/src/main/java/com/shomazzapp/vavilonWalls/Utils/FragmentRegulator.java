package com.shomazzapp.vavilonWalls.Utils;

import com.shomazzapp.vavilonWalls.View.Fragments.WallpaperFragment;
import com.vk.sdk.api.model.VKApiPhoto;
import com.vk.sdk.api.model.VKApiPhotoAlbum;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;

public interface FragmentRegulator {

    HashSet<Integer> getIdsHashSet();

    void setToolbarTitle(String title);

    void loadCategoriesFragment();

    void loadWallsListFragment(int albumId, String category);

    void loadVKWallpaperFragment(ArrayList<VKApiPhoto> walls,
                                 int currentPosition, WallsLoader wallsLoader);

    void loadSavedWallpaperFragment(ArrayList<File> walls,
                                    int currentPosition, WallsLoader wallsLoader);

    void reloadHeader();

    void closeWallpaperFragment();

    WallpaperFragment getWallpaperFragment();

    void setProgressVisible(boolean visible);

    void lockNavView(boolean lock);

    void notifyWallsUpdated();

    void hide();

    ArrayList<VKApiPhotoAlbum> getAlbums();

    void loadAlbums();

}
