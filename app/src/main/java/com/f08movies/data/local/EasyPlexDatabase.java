package com.f08movies.data.local;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.f08movies.data.local.converters.CastConverter;
import com.f08movies.data.local.converters.GenreConverter;
import com.f08movies.data.local.converters.MediaStreamConverter;
import com.f08movies.data.local.converters.MediaSubstitlesConverter;
import com.f08movies.data.local.converters.SaisonConverter;
import com.f08movies.data.local.converters.VideosConverter;
import com.f08movies.data.local.dao.AnimesDao;
import com.f08movies.data.local.dao.MoviesDao;
import com.f08movies.data.local.dao.DownloadDao;
import com.f08movies.data.local.dao.HistoryDao;
import com.f08movies.data.local.dao.ResumeDao;
import com.f08movies.data.local.dao.SeriesDao;
import com.f08movies.data.local.dao.StreamListDao;
import com.f08movies.data.local.entity.Animes;
import com.f08movies.data.local.entity.History;
import com.f08movies.data.local.entity.Media;
import com.f08movies.data.local.entity.Download;
import com.f08movies.data.local.entity.Series;
import com.f08movies.data.local.entity.Stream;
import com.f08movies.data.model.media.Resume;


/**
 * The Room database that contains the Favorite Movies & Series & Animes table
 * Define an abstract class that extends RoomDatabase.
 * This class is annotated with @Database, lists the entities contained in the database,
 * and the DAOs which access them.
 */
@Database(entities = {Media.class, Series.class, Animes.class, Download.class, History.class, Stream.class, Resume.class}, version =52)
@TypeConverters({GenreConverter.class,
        CastConverter.class,
        VideosConverter.class,
        SaisonConverter.class,
        MediaSubstitlesConverter.class,
        MediaStreamConverter.class})
public abstract class EasyPlexDatabase extends RoomDatabase {

    public abstract MoviesDao favoriteDao();
    public abstract SeriesDao seriesDao();
    public abstract AnimesDao animesDao();
    public abstract DownloadDao progressDao();
    public abstract HistoryDao historyDao();
    public abstract StreamListDao streamListDao();
    public abstract ResumeDao resumeDao();


}
