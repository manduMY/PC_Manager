package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class OrderList extends JFrame {
	private static OrderList OL = new OrderList();
	JPanel orderList_panel = new JPanel(); // 주문 목록 리스트 패널
	JPanel southPanel = new JPanel();
	public JLabel orderID = new JLabel("빈 자 리");
	public JTextArea orderList_ta = new JTextArea("", 22,39);
	JScrollPane scroll = new JScrollPane(orderList_ta);
	public JButton logoutBtn = new JButton("로그아웃 시키기");
	public JButton serviceBtn = new JButton("서비스 완료");
	public JButton closeBtn = new JButton("닫기");
	public int selectSeat = -1;
	public static OrderList getInstance() {
		return OL;
	}
	private OrderList() {
		setTitle("주문 목록");
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(10, 10));
		
		orderID.setFont(new Font("돋움", Font.BOLD, 22));
		orderID.setHorizontalAlignment(JLabel.CENTER);
		c.add(orderID, BorderLayout.NORTH);
		
		orderList_panel.add(orderList_ta);
		orderList_ta.setEditable(false);
		c.add(orderList_panel, BorderLayout.CENTER);
		
		logoutBtn.setBackground(Color.black);
		logoutBtn.setFont(new Font("고딕체", Font.PLAIN, 10));
		logoutBtn.setForeground(Color.WHITE);
		serviceBtn.setBackground(Color.black);
		serviceBtn.setFont(new Font("고딕체", Font.PLAIN, 10));
		serviceBtn.setForeground(Color.WHITE);
		closeBtn.setBackground(Color.black);
		closeBtn.setFont(new Font("고딕체", Font.PLAIN, 10));
		closeBtn.setForeground(Color.WHITE);
		
		southPanel.setLayout(new FlowLayout());
		southPanel.add(logoutBtn);
		southPanel.add(serviceBtn);
		southPanel.add(closeBtn);
		c.add(southPanel, BorderLayout.SOUTH);
		
		setSize(500,500);
		setLocationRelativeTo(null);
		// 크기 고정
		super.setResizable(false);
		setVisible(false);
	}
	public void addButtonActionListener(ActionListener listener) {
		serviceBtn.addActionListener(listener);
		closeBtn.addActionListener(listener);
	}
}
