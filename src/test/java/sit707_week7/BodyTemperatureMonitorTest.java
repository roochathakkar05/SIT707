package sit707_week7;

import org.junit.Assert;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class BodyTemperatureMonitorTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "s222037199";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Roocha Thakkar";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
	@Test
	public void testReadTemperatureNegative() {
		TemperatureSensor MockTempSensor = mock(TemperatureSensor.class);
		NotificationSender MockNotificationSender = mock(NotificationSender.class);
		CloudService MockCloudService = mock(CloudService.class);
		
		BodyTemperatureMonitor BodyTemp = new BodyTemperatureMonitor(MockTempSensor,MockCloudService,MockNotificationSender);
		when(MockTempSensor.readTemperatureValue()).thenReturn(-5.0);
		
		double result = BodyTemp.readTemperature();
		Assert.assertEquals(-5.0, result,0.000);	
	}

	
	@Test
	public void testReadTemperatureZero() {
		TemperatureSensor MockTempSensor = mock(TemperatureSensor.class);
		NotificationSender MockNotificationSender = mock(NotificationSender.class);
		CloudService MockCloudService = mock(CloudService.class);
		
		BodyTemperatureMonitor BodyTemp = new BodyTemperatureMonitor(MockTempSensor,MockCloudService,MockNotificationSender);
		when(MockTempSensor.readTemperatureValue()).thenReturn(0.0);
		
		double result = BodyTemp.readTemperature();
		Assert.assertEquals(0.0, result,0.000);	
	}
	
	@Test
	public void testReadTemperatureNormal() {
		TemperatureSensor MockTempSensor = mock(TemperatureSensor.class);
		NotificationSender MockNotificationSender = mock(NotificationSender.class);
		CloudService MockCloudService = mock(CloudService.class);
		
		BodyTemperatureMonitor BodyTemp = new BodyTemperatureMonitor(MockTempSensor,MockCloudService,MockNotificationSender);
		when(MockTempSensor.readTemperatureValue()).thenReturn(37.5);
		
		double result = BodyTemp.readTemperature();
		Assert.assertEquals(37.5, result,0.000);	
	}

	@Test
	public void testReadTemperatureAbnormallyHigh() {
		TemperatureSensor MockTempSensor = mock(TemperatureSensor.class);
		NotificationSender MockNotificationSender = mock(NotificationSender.class);
		CloudService MockCloudService = mock(CloudService.class);
		
		BodyTemperatureMonitor BodyTemp = new BodyTemperatureMonitor(MockTempSensor,MockCloudService,MockNotificationSender);
		when(MockTempSensor.readTemperatureValue()).thenReturn(39.8);
		
		double result = BodyTemp.readTemperature();
		Assert.assertEquals(39.8, result,0.000);	
	}


	@Test
	public void testReportTemperatureReadingToCloud() {
		TemperatureSensor MockTempSensor = mock(TemperatureSensor.class);
		NotificationSender MockNotificationSender = mock(NotificationSender.class);
		CloudService MockCloudService = mock(CloudService.class);
		TemperatureReading TempRead = mock(TemperatureReading.class);
		
		BodyTemperatureMonitor BodyTemp = new BodyTemperatureMonitor(MockTempSensor,MockCloudService,MockNotificationSender);
		doNothing().when(MockCloudService).sendTemperatureToCloud(TempRead);
		
		BodyTemp.reportTemperatureReadingToCloud(TempRead);
		
		verify(MockCloudService, times(1)).sendTemperatureToCloud(TempRead);
		
	}
	
	@Test
	public void testInquireBodyStatusNormalNotification() {
		TemperatureSensor MockTempSensor = mock(TemperatureSensor.class);
		NotificationSender MockNotificationSender = mock(NotificationSender.class);
		CloudService MockCloudService = mock(CloudService.class);
		BodyTemperatureMonitor BodyTemp = new BodyTemperatureMonitor(MockTempSensor,MockCloudService,MockNotificationSender);
		Customer NewCust = BodyTemp.getFixedCustomer();
		when(MockCloudService.queryCustomerBodyStatus(NewCust)).thenReturn("NORMAL");
		
		BodyTemp.inquireBodyStatus();
		
		verify(MockNotificationSender, times(1)).sendEmailNotification(NewCust, "Thumbs Up!");
	}
	

	@Test
	public void testInquireBodyStatusAbnormalNotification() {
		TemperatureSensor MockTempSensor = mock(TemperatureSensor.class);
		NotificationSender MockNotificationSender = mock(NotificationSender.class);
		CloudService MockCloudService = mock(CloudService.class);
		BodyTemperatureMonitor BodyTemp = new BodyTemperatureMonitor(MockTempSensor,MockCloudService,MockNotificationSender);
		FamilyDoctor FamDoc = BodyTemp.getFamilyDoctor();
		Customer NewCust = BodyTemp.getFixedCustomer();
		when(MockCloudService.queryCustomerBodyStatus(NewCust)).thenReturn("ABNORMAL");
		
		BodyTemp.inquireBodyStatus();
		
		verify(MockNotificationSender, times(1)).sendEmailNotification(FamDoc, "Emergency!");
	}
}
