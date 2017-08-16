package com.example.convidado.mondayevents.application.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.convidado.mondayevents.application.models.Event;

import java.util.List;

public class EventsListRVAdapter extends RecyclerView.Adapter<EventsListRVAdapter.ViewHolder>{

    private Context context;
    private List<Event> events;

    public EventsListRVAdapter(){}


    public EventsListRVAdapter(Context context, List<Event> events){
        this.context = context;
        this.events = events;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
