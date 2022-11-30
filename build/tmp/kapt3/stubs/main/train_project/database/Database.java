package train_project.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0002H\u0016J?\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\t2*\u0010\u0013\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u00150\u0014\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0015H\u0016\u00a2\u0006\u0002\u0010\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Ltrain_project/database/Database;", "Ltrain_project/database/IDatabase;", "Ltrain_project/train/Train;", "()V", "_data", "", "_maxId", "", "data", "", "getData", "()Ljava/util/List;", "add", "", "item", "del", "id", "replace", "search", "predicates", "", "Lkotlin/Function1;", "([Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "untitled1"})
public final class Database implements train_project.database.IDatabase<train_project.train.Train> {
    private int _maxId = 0;
    private final java.util.List<train_project.train.Train> _data = null;
    
    public Database() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<train_project.train.Train> getData() {
        return null;
    }
    
    @java.lang.Override()
    public boolean add(@org.jetbrains.annotations.NotNull()
    train_project.train.Train item) {
        return false;
    }
    
    @java.lang.Override()
    public boolean del(int id) {
        return false;
    }
    
    @java.lang.Override()
    public boolean replace(int id, @org.jetbrains.annotations.NotNull()
    train_project.train.Train item) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<train_project.train.Train> search(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super train_project.train.Train, java.lang.Boolean>... predicates) {
        return null;
    }
}