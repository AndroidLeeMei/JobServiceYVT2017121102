package com.example.auser.jobserviceyvt2017121102;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static com.google.android.gms.internal.zzs.TAG;

/**
 * Created by auser on 2017/12/11.
 */

public class MyJob extends JobService {
    FirebaseDatabase database;
    DatabaseReference myRef;
    @Override
    public boolean onStartJob(JobParameters jobParameters) {
        Log.d("JOB", "onStartJob");


        return false;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        Log.d("JOB", "onStopJob");
        return false;
    }
}
