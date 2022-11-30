package train_project.train;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J1\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u00d6\u0003J\t\u0010!\u001a\u00020\"H\u00d6\u0001J\b\u0010#\u001a\u00020\u0003H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006$"}, d2 = {"Ltrain_project/train/Train;", "Ltrain_project/train/ITrain;", "station", "", "number", "countOfWagons", "", "types", "Ltrain_project/train/TrainTypes;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Number;Ltrain_project/train/TrainTypes;)V", "getCountOfWagons", "()Ljava/lang/Number;", "setCountOfWagons", "(Ljava/lang/Number;)V", "getNumber", "()Ljava/lang/String;", "setNumber", "(Ljava/lang/String;)V", "getStation", "setStation", "getTypes", "()Ltrain_project/train/TrainTypes;", "setTypes", "(Ltrain_project/train/TrainTypes;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "untitled1"})
public final class Train implements train_project.train.ITrain {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String station;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String number;
    @org.jetbrains.annotations.NotNull()
    private java.lang.Number countOfWagons;
    @org.jetbrains.annotations.NotNull()
    private train_project.train.TrainTypes types;
    
    @org.jetbrains.annotations.NotNull()
    public final train_project.train.Train copy(@org.jetbrains.annotations.NotNull()
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
    
    public Train(@org.jetbrains.annotations.NotNull()
    java.lang.String station, @org.jetbrains.annotations.NotNull()
    java.lang.String number, @org.jetbrains.annotations.NotNull()
    java.lang.Number countOfWagons, @org.jetbrains.annotations.NotNull()
    train_project.train.TrainTypes types) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
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
    public final java.lang.String component2() {
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
    public final java.lang.Number component3() {
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
    public final train_project.train.TrainTypes component4() {
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
}