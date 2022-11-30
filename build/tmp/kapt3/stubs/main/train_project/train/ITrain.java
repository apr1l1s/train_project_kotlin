package train_project.train;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u00020\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\u0018\u0010\u0011\u001a\u00020\u0012X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Ltrain_project/train/ITrain;", "", "countOfWagons", "", "getCountOfWagons", "()Ljava/lang/Number;", "setCountOfWagons", "(Ljava/lang/Number;)V", "number", "", "getNumber", "()Ljava/lang/String;", "setNumber", "(Ljava/lang/String;)V", "station", "getStation", "setStation", "types", "Ltrain_project/train/TrainTypes;", "getTypes", "()Ltrain_project/train/TrainTypes;", "setTypes", "(Ltrain_project/train/TrainTypes;)V", "untitled1"})
public abstract interface ITrain {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getStation();
    
    public abstract void setStation(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getNumber();
    
    public abstract void setNumber(@org.jetbrains.annotations.NotNull()
    java.lang.String p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.Number getCountOfWagons();
    
    public abstract void setCountOfWagons(@org.jetbrains.annotations.NotNull()
    java.lang.Number p0);
    
    @org.jetbrains.annotations.NotNull()
    public abstract train_project.train.TrainTypes getTypes();
    
    public abstract void setTypes(@org.jetbrains.annotations.NotNull()
    train_project.train.TrainTypes p0);
}