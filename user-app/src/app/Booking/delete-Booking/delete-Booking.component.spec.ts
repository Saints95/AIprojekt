import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { deleteBookingComponent } from './delete-Booking.component';

describe('deleteBookingComponent', () => {
  let component: deleteBookingComponent;
  let fixture: ComponentFixture<deleteBookingComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ deleteBookingComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(deleteBookingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});