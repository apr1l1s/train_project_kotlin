package train_project.train;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 *2\u00020\u0001:\u0001*B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J;\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u00c6\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u00d6\u0003J\t\u0010(\u001a\u00020\u0003H\u00d6\u0001J\b\u0010)\u001a\u00020\u0005H\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006+"}, d2 = {"Ltrain_project/train/Train;", "Ltrain_project/train/ITrain;", "id", "", "station", "", "number", "countOfWagons", "", "types", "Ltrain_project/train/TrainTypes;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ltrain_project/train/TrainTypes;)V", "getCountOfWagons", "()Ljava/lang/Number;", "setCountOfWagons", "(Ljava/lang/Number;)V", "getId", "()I", "setId", "(I)V", "getNumber", "()Ljava/lang/String;", "setNumber", "(Ljava/lang/String;)V", "getStation", "setStation", "getTypes", "()Ltrain_project/train/TrainTypes;", "setTypes", "(Ltrain_project/train/TrainTypes;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "untitled1"})
public final class Train implements train_project.train.ITrain {
    private int id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String station;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String number;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Number countOfWagons;
    @org.jetbrains.annotations.NotNull()
    private train_project.train.TrainTypes types;
    @org.jetbrains.annotations.NotNull()
    public static final train_project.train.Train.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final train_project.train.Train copy(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String station, @org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    java.lang.Number countOfWagons, @org.jetbrains.annotations.NotNull()
    train_project.train.TrainTypes types) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public Train(int id, @org.jetbrains.annotations.NotNull()
    java.lang.String station, @org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    java.lang.Number countOfWagons, @org.jetbrains.annotations.NotNull()
    train_project.train.TrainTypes types) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    @java.lang.Override()
    public int getId() {
        return 0;
    }
    
    @java.lang.Override()
    public void setId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getStation() {
        return null;
    }
    
    @java.lang.Override()
    public void setStation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getNumber() {
        return null;
    }
    
    @java.lang.Override()
    public void setNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Number component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.Number getCountOfWagons() {
        return null;
    }
    
    @java.lang.Override()
    public void setCountOfWagons(@org.jetbrains.annotations.NotNull()
    java.lang.Number p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final train_project.train.TrainTypes component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public train_project.train.TrainTypes getTypes() {
        return null;
    }
    
    @java.lang.Override()
    public void setTypes(@org.jetbrains.annotations.NotNull()
    train_project.train.TrainTypes p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Ltrain_project/train/Train$Companion;", "", "()V", "toTrain", "Ltrain_project/train/Train;", "s", "", "untitled1"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final train_project.train.Train toTrain(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
            return null;
        }
    }
}