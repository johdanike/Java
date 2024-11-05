package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary;
    @BeforeEach
    void startWith(){
        diary = new Diary("JohDan", "correctPin");
    }

    @Test public void diaryIsUnlocked_atDefault_test(){
        assertFalse(diary.isLocked());
    }
    @Test public void diaryIsUnlocked_butCanBeLocked(){
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
    }
    @Test public void diaryIsLocked_butCanBeUnlocked(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("correctPin");
        assertFalse(diary.isLocked());
    }
    @Test public void diaryCanBeUnlocked_withCorrectPin(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("correctPin");
        assertFalse(diary.isLocked());
    }
    @Test public void diaryCannotBeUnlocked_withWrongPin(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("wrongPin");
        assertTrue(diary.isLocked());
    }
    @Test public void diaryCanAddEntry_diaryIsNotEmpty(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("correctPin");
        assertFalse(diary.isLocked());
        diary.add("Title","Body");
        assertEquals(1, diary.size());
    }
    @Test
    public void addEntryToDiary_diaryIsLocked_diaryIsEmpty(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.add("Title","Body");
        assertTrue(diary.isLocked());
    }
    @Test
    public void addTwoEntryToDiary_diarySizeIsTwo_test(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("correctPin");
        assertFalse(diary.isLocked());
        diary.add("Title","Body");
        diary.add("Title2","Body2");
        assertFalse(diary.isEmpty());
        assertEquals(2, diary.size());
    }
    @Test
    public void addTwoEntryToDiary_findById_test(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("correctPin");
        assertFalse(diary.isLocked());
        diary.add("Title","Body");
        diary.add("Title2","Body2");
        diary.findById('1');
    }
    @Test
    public void entriesCanBeDeletedFromDiary_test(){
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("correctPin");
        assertFalse(diary.isLocked());
        diary.add("Title","Body");
        diary.add("Title2","Body2");
        diary.add("Title3","Body3");
        assertEquals(3, diary.size());
        String deleted = diary.deleteEntry(2);
//        String toBeDel = diary.findById(2);
        assertEquals(2, diary.size());
    }


}
