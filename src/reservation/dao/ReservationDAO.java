package reservation.dao;

import java.util.List;

import reservation.dto.ReservationDTO;

public interface ReservationDAO {
	public List mainPage_reserve_list();//전체 예약목록
	public List branchPage_reserve_list(int branch_id);//가맹점의 고유id에 해당하는 예약목록
	public List room_reserve_list(int room_id); //방의 고유id에 해당하는 예약목록
	public void deleteMember(String reserve_date);//두달이 지난 예약건은 삭제
	
	public ReservationDTO insertReserve(ReservationDTO dto);
}
